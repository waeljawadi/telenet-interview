import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {Customer} from '../model/customer.model';
import {HttpClient} from '@angular/common/http';


@Injectable({
  providedIn: 'root',
})
export class CustomerService {

  constructor(private http: HttpClient) {
  }

  getCustomers(): Observable<Customer[]> {
    return this.http.get<Customer[]>('customer');
  }


}
