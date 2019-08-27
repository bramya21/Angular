import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HttpPromiseComponent } from './http-promise.component';

describe('HttpPromiseComponent', () => {
  let component: HttpPromiseComponent;
  let fixture: ComponentFixture<HttpPromiseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HttpPromiseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HttpPromiseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
