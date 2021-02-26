import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ResenjeUnosComponent } from './resenje-unos.component';

describe('ResenjeUnosComponent', () => {
  let component: ResenjeUnosComponent;
  let fixture: ComponentFixture<ResenjeUnosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ResenjeUnosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ResenjeUnosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
