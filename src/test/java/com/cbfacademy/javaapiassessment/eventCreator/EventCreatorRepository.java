package com.cbfacademy.javaapiassessment.eventCreator;


import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;

public interface EventCreatorRepository extends ListCrudRepository<EventCreator, UUID> {

}
