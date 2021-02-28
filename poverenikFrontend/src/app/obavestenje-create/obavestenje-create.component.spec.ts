import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObavestenjeCreateComponent } from './obavestenje-create.component';

describe('ObavestenjeCreateComponent', () => {
  let component: ObavestenjeCreateComponent;
  let fixture: ComponentFixture<ObavestenjeCreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ObavestenjeCreateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ObavestenjeCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
