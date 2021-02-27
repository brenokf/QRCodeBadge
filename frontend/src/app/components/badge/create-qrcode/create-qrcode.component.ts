/* eslint-disable class-methods-use-this */
/* eslint-disable import/prefer-default-export */
import { url } from '@angular-devkit/schematics';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-create-qrcode',
  templateUrl: './create-qrcode.component.html',
  styleUrls: ['./create-qrcode.component.css'],
})
export class CreateQrcodeComponent implements OnInit {
  public qrdata: string = null;
  // eslint-disable-next-line lines-between-class-members
  public level : 'L'|'M'|'Q'|'H';

  constructor() {
    this.qrdata = 'https://github.com/florinpop17/app-ideas/blob/master/Projects/2-Intermediate/QRCode-Badge-App.md';
    this.level = 'M';
  }

  ngOnInit(): void {
  }
}
