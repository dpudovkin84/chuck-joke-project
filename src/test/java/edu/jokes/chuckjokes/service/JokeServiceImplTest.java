package edu.jokes.chuckjokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class JokeServiceImplTest {

    JokeService jokeService;

    @Mock
    private ChuckNorrisQuotes chuckNorrisQuotes;

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
        jokeService =new JokeServiceImpl(chuckNorrisQuotes);
        when(chuckNorrisQuotes.getRandomQuote()).thenReturn("TestJoke");
    }

    @Test
    void getJoke() {
        String joke= jokeService.getJoke();
        String expected="TestJoke";
        assertEquals(expected,joke);
    }
}