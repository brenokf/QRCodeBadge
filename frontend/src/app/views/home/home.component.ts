/* eslint-disable space-before-blocks */
/* eslint-disable lines-between-class-members */
/* eslint-disable no-empty-function */
/* eslint-disable no-undef */
/* eslint-disable no-useless-constructor */
/* eslint-disable import/prefer-default-export */
/* eslint-disable no-unused-vars */
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {
  FormBuilder, FormControl, FormGroup, Validators,
} from '@angular/forms';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  homeForm: FormGroup;

  constructor(private router :Router,
      private fb: FormBuilder) {

  }
  get f() { return this.homeForm.controls; }

  // eslint-disable-next-line class-methods-use-this
  ngOnInit(): void {
    this.homeForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      twitter: [''],
      github: [''],
    });
  }

  navigationToGenerate():void{
    this.router.navigate(['/generate']);
  }

  onSubmit() {
    this.homeForm.reset();
    this.homeForm.get('name').clearValidators();
    this.homeForm.get('name').updateValueAndValidity();
    this.homeForm.get('email').clearValidators();
    this.homeForm.get('email').updateValueAndValidity();
    this.homeForm.get('twitter').clearValidators();
    this.homeForm.get('twitter').updateValueAndValidity();
    this.homeForm.get('github').clearValidators();
    this.homeForm.get('github').updateValueAndValidity();
  }

  getErrorMessageName(){
    if (this.f.name.hasError('required')) {
      return 'Forneça seu nome';
    }
    return '';
  }

  getErrorMessageEmail() {
    if (this.f.email.hasError('required')) {
      return 'Forneça um E-mail valido';
    }
    return this.f.email.hasError('email') ? 'E-mail invalido' : '';
  }
}
