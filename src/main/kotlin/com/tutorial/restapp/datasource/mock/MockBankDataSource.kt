package com.tutorial.restapp.datasource.mock

import com.tutorial.restapp.datasource.BankDataSource
import com.tutorial.restapp.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    override fun getBanks(): Collection<Bank> {
        TODO("Not yet implemented")
    }
}