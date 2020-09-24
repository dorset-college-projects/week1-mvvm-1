package com.example.mvvm001.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.mvvm001.data.Quote
import com.example.mvvm001.data.QuoteRepository

class QuotesViewModel (private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

}