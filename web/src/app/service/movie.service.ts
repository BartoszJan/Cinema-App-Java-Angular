import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpParams, HttpHeaders } from '@angular/common/http';
import { Observable, throwError as observableThrowError } from 'rxjs';
import { catchError, map } from 'rxjs/operators';

import { Movie } from 'src/app/model/movie';

const HTTP_OPTIONS = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
  })
};

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  private baseUrl : string;
  private httpOptions;

  constructor(private http: HttpClient) {
    this.baseUrl = 'http://localhost:8080/';
    this.httpOptions = HTTP_OPTIONS;
  }

  public getAllMovies() : Observable<Movie[]> {
    return this.http
      .get<Movie[]>(this.baseUrl +  "movies")
      .pipe(map(data => data), catchError(this.handleError));
  }

  private handleError(res: HttpErrorResponse | any) {
    console.error(res.error || res.body.error);
    return observableThrowError(res.error || 'Server error');
  }
}
