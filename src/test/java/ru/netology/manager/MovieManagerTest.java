package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    MovieManager manager = new MovieManager();

    private Movie first = new Movie(1, "Bloodshot","action",2020);
    private Movie second = new Movie(2, "Upward","cartoon",2020);
    private Movie third = new Movie(3, "HotelBelgrade","comedy",2020);
    private Movie fourth = new Movie(4, "Gentlemen","action",2020);
    private Movie fifth = new Movie(5, "TheInvisibleMan","horror",2020);
    private Movie sixth = new Movie(6, "Trolls","cartoon",2020);
    private Movie seventh = new Movie(7, "TheNumberOne","comedy",2020);
    private Movie eighth = new Movie(8, "WonderWoman","fantasy",2021);
    private Movie ninth = new Movie(9, "Soul","cartoon",2021);
    private Movie tenth = new Movie(10, "WrathOfMan","thriller",2021);




    @Test
    void shouldShowAll() {
        MovieManager manager = new MovieManager(10);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Movie[] actual = manager.getLast();
        Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldNotShowMovies(){
        MovieManager manager = new MovieManager(0);
        Movie[] actual = manager.getLast();
        Movie[] expected = new Movie[0];
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldNotShowOverMax(){
        MovieManager manager = new MovieManager(11);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Movie[] actual = manager.getLast();
        Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLessThanTen() {
        MovieManager manager = new MovieManager(4);

        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Movie[] actual = manager.getLast();
        Movie[] expected = {tenth, ninth, eighth, seventh};
        assertArrayEquals(expected, actual);
    }


}