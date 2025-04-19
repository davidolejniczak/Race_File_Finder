import com.strava.api.v3.*;
import com.strava.api.v3.auth.*;
import com.strava.api.v3.model.*;
import com.strava.api.v3.api.ActivitiesApi;

import rx.Observable;

public class StravaComs {
  public static void main(String... args) {
    ApiClient client = new ApiClient(...);
    ActivitiesApi api = client.createService(ActivitiesApi.class);

    String name = name_example; // String | The name of the activity.
    String sportType = sportType_example; // String | Sport type of activity. For example - Run, MountainBikeRide, Ride, etc.
    Date startDateLocal = 2013-10-20T19:20:30+01:00; // Date | ISO 8601 formatted date time.
    Integer elapsedTime = 56; // Integer | In seconds.
    String type = type_example; // String | Type of activity. For example - Run, Ride etc.
    String description = description_example; // String | Description of the activity.
    Float distance = 3.4; // Float | In meters.
    Integer trainer = 56; // Integer | Set to 1 to mark as a trainer activity.
    Integer commute = 56; // Integer | Set to 1 to mark as commute.

    Observable<DetailedActivity> result = apiInstance.createActivity(name, sportType, startDateLocal, elapsedTime, type, description, distance, trainer, commute);
    result.subscribe(System.out::println, Throwable::printStackTrace);
  }
}
