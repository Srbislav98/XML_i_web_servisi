import { TestBed } from '@angular/core/testing';

import { XonomyService } from './xonomyResenje.service';

describe('XonomyService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: XonomyService = TestBed.get(XonomyService);
    expect(service).toBeTruthy();
  });
});