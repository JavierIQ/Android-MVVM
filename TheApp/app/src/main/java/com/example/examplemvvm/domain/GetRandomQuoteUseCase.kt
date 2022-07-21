package com.example.examplemvvm.domain

import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke(): QuoteModel?{
        val quotes = QuoteProvider.quote
        if (quotes.isNotEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }

}