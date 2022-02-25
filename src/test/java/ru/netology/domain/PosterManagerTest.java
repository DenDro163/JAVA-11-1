package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest {

    @Test
    void shouldTestAdd() {
        Film first = new Film(1, 1, "Bloodshot", "love story");
        Film second = new Film(2, 2, "Go ahead", "action movie");
        Film third = new Film(3, 3, "Hotel", "thriller");
        Film fourth = new Film(4, 4, "Gentlemen", "action movie");
        Film fifth = new Film(5, 5, "Invisible man", "horror");
        Film sixth = new Film(6, 6, "Trolls", "action movie");
        Film seventh = new Film(7, 7, "Number one", "comedy");
        Film eighth = new Film(8, 8, "Shmatrix", "action movie");
        Film ninth = new Film(9, 9, "Island", "SciFi");
        Film tenth = new Film(10, 10, "Worms 3", "art house");
        Film eleventh = new Film(11, 111, "Evil banana", "drama");

        PosterManager managers = new PosterManager();
        managers.add(first);
        managers.add(second);
        managers.add(third);
        managers.add(fourth);
        managers.add(fifth);
        managers.add(sixth);
        managers.add(seventh);
        managers.add(eighth);
        managers.add(ninth);
        managers.add(tenth);
        managers.add(eleventh);

        Film[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        Film[] actual = managers.findAll();
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldTestAddAnotherConstructor() {
        Film first = new Film(1, 1, "Bloodshot", "love story");
        Film second = new Film(2, 2, "Go ahead", "action movie");
        Film third = new Film(3, 3, "Hotel", "thriller");
        Film fourth = new Film(4, 4, "Gentlemen", "action movie");
        Film fifth = new Film(5, 5, "Invisible man", "horror");
        Film sixth = new Film(6, 6, "Trolls", "action movie");
        Film eleventh = new Film(11, 111, "Evil banana", "drama");

        PosterManager managers = new PosterManager(5);
        managers.add(first);
        managers.add(second);
        managers.add(third);
        managers.add(fourth);
        managers.add(fifth);
        managers.add(sixth);


        Film[] expected = {first, second, third, fourth, fifth, sixth};
        Film[] actual = managers.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldTestFindAll() {
        Film first = new Film(1, 1, "Bloodshot", "love story");
        Film second = new Film(2, 2, "Go ahead", "action movie");
        Film third = new Film(3, 3, "Hotel", "thriller");
        Film fourth = new Film(4, 4, "Gentlemen", "action movie");
        Film fifth = new Film(5, 5, "Invisible man", "horror");
        Film sixth = new Film(6, 6, "Trolls", "action movie");
        Film seventh = new Film(7, 7, "Number one", "comedy");
        Film eighth = new Film(8, 8, "Shmatrix", "action movie");
        Film ninth = new Film(9, 9, "Island", "SciFi");
        Film tenth = new Film(10, 10, "Worms 3", "art house");


        PosterManager managers = new PosterManager();

        Film[] expected = {};
        Film[] actual = managers.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldTestFindAllAnotherConstructor() {
        Film first = new Film(1, 1, "Bloodshot", "love story");
        Film second = new Film(2, 2, "Go ahead", "action movie");
        Film third = new Film(3, 3, "Hotel", "thriller");
        Film fourth = new Film(4, 4, "Gentlemen", "action movie");
        Film fifth = new Film(5, 5, "Invisible man", "horror");


        PosterManager managers = new PosterManager(5);

        Film[] expected = {};
        Film[] actual = managers.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldTestFindLastFromBegin() {
        Film first = new Film(1, 1, "Bloodshot", "love story");
        Film second = new Film(2, 2, "Go ahead", "action movie");
        Film third = new Film(3, 3, "Hotel", "thriller");
        Film fourth = new Film(4, 4, "Gentlemen", "action movie");
        Film fifth = new Film(5, 5, "Invisible man", "horror");
        Film sixth = new Film(6, 6, "Trolls", "action movie");
        Film seventh = new Film(7, 7, "Number one", "comedy");
        Film eighth = new Film(8, 8, "Shmatrix", "action movie");
        Film ninth = new Film(9, 9, "Island", "SciFi");
        Film tenth = new Film(10, 10, "Worms 3", "art house");

        PosterManager managers = new PosterManager();
        managers.add(first);
        managers.add(second);
        managers.add(third);
        managers.add(fourth);
        managers.add(fifth);

        Film[] expected = {fifth, fourth, third, second, first};
        Film[] actual = managers.findLast();
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldTestFindLastFromMiddle() {
        Film first = new Film(1, 1, "Bloodshot", "love story");
        Film second = new Film(2, 2, "Go ahead", "action movie");
        Film third = new Film(3, 3, "Hotel", "thriller");
        Film fourth = new Film(4, 4, "Gentlemen", "action movie");
        Film fifth = new Film(5, 5, "Invisible man", "horror");
        Film sixth = new Film(6, 6, "Trolls", "action movie");
        Film seventh = new Film(7, 7, "Number one", "comedy");
        Film eighth = new Film(8, 8, "Shmatrix", "action movie");
        Film ninth = new Film(9, 9, "Island", "SciFi");
        Film tenth = new Film(10, 10, "Worms 3", "art house");

        PosterManager managers = new PosterManager();
        managers.add(sixth);
        managers.add(seventh);
        managers.add(eighth);
        managers.add(ninth);
        managers.add(tenth);

        Film[] expected = {tenth, ninth, eighth, seventh, sixth};
        Film[] actual = managers.findLast();
        assertArrayEquals(expected, actual);
    }

}