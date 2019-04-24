import { Component, OnInit } from '@angular/core';
import { MovieService } from 'src/app/service/movie.service';
import { Movie } from 'src/app/model/movie';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.less']
})
export class MovieListComponent implements OnInit {

  private movieList: Movie[];
  dataAvailable : boolean;

  constructor(private movieService: MovieService) {
    this.dataAvailable = false;
  }

  ngOnInit() {
    this.getMovieList();
  }

  private getMovieList() {
  this.dataAvailable = true;

    this.movieService.getAllMovies()
      .subscribe(
        movies => {
          if(movies.length > 0) {
            this.movieList = movies;
            console.log(this.movieList);
          } else {
            this.dataAvailable = false;
          }
        }, error => console.log(error) );
  }
}
