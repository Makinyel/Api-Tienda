package com.example.proyecto.infrastructure.adapter.person;

import com.example.proyecto.domain.model.Person;
import com.example.proyecto.domain.service.person.PersonService;
import com.example.proyecto.infrastructure.mapper.PersonDtoMapper;
import com.example.proyecto.infrastructure.repository.person.PersonRepository;
import com.example.proyecto.shared.base.PersonwithIDAlreadyException;
import java.util.List;
import java.util.Objects;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonAdapter implements PersonService {

  private final PersonRepository personRepository;
  private final PersonDtoMapper personDtoMapper;

  @Override
  public Person createPerson(Person person) {
    validateIdentification(person.getNumberId());
    return personDtoMapper.toEntity(personRepository.save(personDtoMapper.toDto(person)));
  }

  @Override
  public Person findById(Long id) {
    return personRepository.findById(id).map(personDtoMapper::toEntity).orElse(null);
  }

  @Override
  public List<Person> findAllPersons() {
    return personDtoMapper.toEntity(personRepository.findAll());
  }

  private void validateIdentification(String numberId) {
    if (Objects.nonNull(numberId)) {
      Person personResul = personRepository.findByNumberId(numberId)
          .map(personDtoMapper::toEntity).orElse(null);
      if (Objects.nonNull(personResul)) {
        throw new PersonwithIDAlreadyException(
            "YA HAY UNA PERSONA REGISTRADA CON ESTE NUMERO DE IDENTIFIACIÓN "
                + personResul.getNumberId());
      }
    }
  }
}

