package com.hilt.sample.hilt

import com.hilt.sample.data.GoodUser
import com.hilt.sample.data.User
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Qualifier

/**
 * 界面描述：
 * <p>
 * Created by tianyang on 2020/11/16.
 */
@Module
@InstallIn(ApplicationComponent::class)
object HiltModule2 {

    @Provides
    fun provideUser(): User {
        val user = User(999, "aaa", "难过")
        return user
    }

    @AUser
    @Provides
    fun provideAGoodUser(user: User): GoodUser {
        return GoodUser(user, "AUser")
    }

    @BUser
    @Provides
    fun provideBGoodUser(user: User): GoodUser {
        return GoodUser(user, "BUser")
    }
}


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AUser

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BUser