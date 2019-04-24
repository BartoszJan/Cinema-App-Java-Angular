import { Showing } from './showing';

export class Ticket {
  id: number;
  showing: Showing;
  userName: string;
  userLastName: string;
  seat: number;
  purchaseDate: Date;
}
