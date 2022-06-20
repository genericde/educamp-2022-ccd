import { Component, OnInit } from '@angular/core';
import { FizzBuzz } from './fizz-buzz-2/fizz-buzz.class';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  ngOnInit(): void {
    FizzBuzz.doFizzBuzz();
  }
}
