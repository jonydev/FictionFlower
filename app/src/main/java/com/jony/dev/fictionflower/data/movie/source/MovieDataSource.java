package com.jony.dev.fictionflower.data.movie.source;

import android.support.annotation.NonNull;

import com.jony.dev.fictionflower.data.movie.Movie;

import java.util.List;

/**
 * Created by zhouh on 2016/5/16.
 */
public interface MovieDataSource {
    interface LoadMoviesCallback {
        void onMoviesLoaded(List<Movie> movies);
        void onDataNotAvailable();
    }

    interface GetMovieCallback {
        void onMovieLoaded(Movie movie);
        void onDataNotAvailable();
    }

    void getMovies(@NonNull LoadMoviesCallback callback);

    void getMovie(@NonNull String movieId,@NonNull GetMovieCallback callback);

    void saveMovie(@NonNull Movie movie);

    void deleteMovie(@NonNull String movieId);
}
