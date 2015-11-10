package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by earlbozarth on 11/10/15.
 */
public interface MessageRepo extends CrudRepository<Message, Integer> {
}
