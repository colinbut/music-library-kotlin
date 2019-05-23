/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.model.User
import java.util.*
import kotlin.collections.HashMap

class UserRepositoryImpl : UserRepository {

    private val users : MutableMap<UUID, User>

    init {
        users = HashMap()
    }

    override fun listUsers(): List<User> {
        return users.values.toList()
    }

    override fun getUser(userId: UUID): User {
        return users[userId]!!
    }

    override fun createNewUser(user: User) {
        users[UUID.randomUUID()] = user
    }

    override fun updateUser(userId: UUID, user: User) {
        users[userId] = user
    }

    override fun deleteUser(userId: UUID) {
        users.remove(userId)
    }

}