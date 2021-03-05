import { ResenjeService } from './resenje.service';
import { TestBed } from '@angular/core/testing';


describe('FakultetService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ResenjeService = TestBed.get(ResenjeService);
    expect(service).toBeTruthy();
  });
});