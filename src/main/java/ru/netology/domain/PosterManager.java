package ru.netology.domain;

public class PosterManager {
    private int lastIndex = 10;//Количество фильмов в афише
    private Film[] movies = new Film[0];


    public PosterManager() {//Дефолтный конструктор
    }

    public PosterManager(int lastIndex) {// конструктор с 1 параметром
        this.lastIndex = lastIndex;
    }//Недефолтный конструктор


    public void add(Film movie) {// Добавление нового фильма.
        int length = movies.length + 1;
        Film[] tmp = new Film[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;

    }


    public Film[] findAll() { //Вывод всех фильмов в порядке добавления
        return movies;
    }

    public Film[] findLast() {// Вывод последних добавленных фильмов в обратном от добавления порядке
        int resultLength = movies.length;
        if (resultLength > lastIndex) {
            resultLength = lastIndex;
        } else {
            resultLength = movies.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
