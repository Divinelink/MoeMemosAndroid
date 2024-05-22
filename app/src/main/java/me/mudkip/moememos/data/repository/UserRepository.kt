package me.mudkip.moememos.data.repository

import com.skydoves.sandwich.ApiResponse
import me.mudkip.moememos.data.api.MemosV0User
import me.mudkip.moememos.data.service.AccountService
import javax.inject.Inject

class UserRepository @Inject constructor(private val accountService: AccountService) {
    suspend fun getCurrentUser(): ApiResponse<MemosV0User> = accountService.memosCall { api ->
        api.me()
    }
}