import { Component, OnInit } from '@angular/core';
import { createFizzBuzzArrayFrom1ToN } from './fizz-buzz/fizz-buzz.const';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  ngOnInit(): void {
    const array = createFizzBuzzArrayFrom1ToN(100);
  }
}
