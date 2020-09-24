package com.example.mvvm001.utilities

import com.example.mvvm001.data.FakeDatabase
import com.example.mvvm001.data.QuoteRepository
import com.example.mvvm001.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}