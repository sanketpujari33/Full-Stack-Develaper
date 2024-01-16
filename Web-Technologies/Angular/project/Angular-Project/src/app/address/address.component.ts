import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-address',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './address.component.html',
  styleUrl: './address.component.css'
})
export class AddressComponent implements OnInit {
  user :any;
  constructor(){
    this.user={
      name: 'Sanket',
      address:'1234,A.nager',
      phone: ['123-123-1234','345-345-3456','987-987-8789']
    };
  }
  ngOnInit(): void{

  }
}
