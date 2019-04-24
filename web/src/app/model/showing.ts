import { Ticket } from './ticket';
import { Movie } from './movie';

export class Showing {
  id: number;
  movie: Movie;
  showingDateTime: Date;
  roomNumber: number;
  tickets: Ticket[];
}
