import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../service/customer.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  constructor(private customerService: CustomerService) {
  }

  ngOnInit() {

    this.customerService.getCustomers().subscribe();
  }

}
