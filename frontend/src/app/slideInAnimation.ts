/* eslint-disable import/prefer-default-export */
import {
  trigger, animate, transition, style, query, animateChild, group,
} from '@angular/animations';

export const slideInAnimation = trigger('routeAnimations', [
  transition('HomePage <=> GeneratePage', [
    style({ position: 'relative' }),
    query(':enter, :leave', [
      style({
        position: 'absolute',
        top: 0,
        left: 0,
        width: '100%',
      }),
    ]),
    query(':enter', [
      style({ left: '-100%' }),
    ]),
    query(':leave', animateChild()),
    group([
      query(':enter',
        animate('300ms ease-out', style({ left: '0%' }))),
    ]),
  ]),
  query(':enter', animateChild()),
]);
