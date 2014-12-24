package pl.malopolska.smoksmog.data;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pl.malopolska.smoksmog.network.SmokSmogAPI;
import retrofit.RestAdapter;

/**
 *
 */
@Module(
        library = true
)
class SmokSmogModule {

    private final Application application;

    SmokSmogModule( Application application ) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context providesApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    SmokSmogAPI providesSmokSmogAPI() {

        RestAdapter restAdapter = new RestAdapter.Builder()
                .build();

        return restAdapter.create( SmokSmogAPI.class );
    }
}