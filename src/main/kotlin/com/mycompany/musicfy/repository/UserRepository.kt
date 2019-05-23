/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.musicfy.repository

import com.mycompany.musicfy.model.User
import java.util.*

interface UserRepository {
    fun listUsers() : List<User>
    fun getUser(userId: UUID) : User
    fun createNewUser(user: User)
    fun updateUser(userId: UUID, user: User)
    fun deleteUser(userId: UUID)
}