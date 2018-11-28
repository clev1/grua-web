package com.grua.gruaweb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Mockito.when;
import static sun.nio.cs.Surrogate.is;

@RunWith(SpringRunner.class)

public class BackendControllerTest {

    @LocalServerPort
    private int port;

    @Test
    public void firstTest(){
      //TODO: write test to test routing
    }
}