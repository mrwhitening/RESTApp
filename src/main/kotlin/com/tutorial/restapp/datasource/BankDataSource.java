package com.tutorial.restapp.datasource;
import com.tutorial.restapp.model.Bank
import java.util.Collection;

public interface BankDataSource {
    fun getBanks(): Collection<Bank>
}
