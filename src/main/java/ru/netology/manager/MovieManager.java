package ru.netology.manager;

import ru.netology.domain.Movie;


public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int numberOfMovies = 10;


    public MovieManager() {
    }

    public MovieManager(int numberOfMovies) {
        if (numberOfMovies < 0) {
            return;
        }
        this.numberOfMovies = numberOfMovies;
    }

    public void add(Movie movie) {
        //новый массив на единицу больше
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++){
            tmp[i] = movies[i];
        }

        //кладем последний элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;

    }

    public Movie[] getLast() {
        int moviesLength = movies.length;
        if (moviesLength < numberOfMovies) {
            numberOfMovies = moviesLength;
        }
        Movie[] result = new Movie[movies.length];
        //перебираем массив в прямом порядке, но кладем рез-ты в обратном
        for (int i = 0; i < result.length; i++){
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
