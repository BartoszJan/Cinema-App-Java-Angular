import { Showing } from './showing';

export class Movie {
  id: number;
  title: string;
  year: Date;
  duration: number;
  description: string;
  director: string;
  showings: Showing[];
  imageSource: string;
}
