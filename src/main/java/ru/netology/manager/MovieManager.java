package ru.netology.manager;

import ru.netology.domain.Movie;


public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int numberOfMovies = 10;


    public MovieManager() {
    }

    public MovieManager(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public void add(Movie movie) {
        //новый массив на единицу больше
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy (movies,0, tmp,0, movies.length);
        //кладем последний элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;

    }

    public Movie[] getLast() {
        int resultLength = numberOfMovies;
        if (movies.length < resultLength) {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        //перебираем массив в прямом порядке, но кладем рез-ты в обратном
        for (int i = 0; i < resultLength; i++){
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
