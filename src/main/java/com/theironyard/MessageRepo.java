package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by earlbozarth on 11/10/15.
 */

//One REPO for One TABLE in DB
public interface MessageRepo extends CrudRepository<Message, Integer> {
}
