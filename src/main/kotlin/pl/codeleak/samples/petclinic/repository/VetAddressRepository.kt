package pl.codeleak.samples.petclinic.repository

import org.springframework.data.repository.PagingAndSortingRepository
import pl.codeleak.samples.petclinic.model.VetAddress

interface VetAddressRepository : PagingAndSortingRepository<VetAddress, Int>
