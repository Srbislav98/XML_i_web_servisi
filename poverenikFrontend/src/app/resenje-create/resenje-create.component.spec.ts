import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ResenjeCreateComponent } from './resenje-create.component';

describe('ResenjeCreateComponent', () => {
  let component: ResenjeCreateComponent;
  let fixture: ComponentFixture<ResenjeCreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ResenjeCreateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ResenjeCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
