# ZooSeeker: Interactive Zoo Navigation App

ZooSeeker is an Android application designed to enhance the visitor experience at the San Diego Zoo. The app helps users navigate the zoo efficiently by allowing them to create visitation plans, search for exhibits, and get real-time directions based on their location within the zoo. The map-style interface enables users to plot actionable paths to the exhibits they want to visit.

## Features

- **Plan Visits**: Create, modify, and manage visitation plans for a customized zoo experience.
- **Search for Exhibits**: Easily search through an extensive database of zoo exhibits to find specific animals or attractions.
- **Navigation**: Provides step-by-step directions with real-time updates, ensuring visitors never lose their way.
- **Location Awareness**: Utilizes real-time location data to enhance navigation and exhibit discovery.

## Screenshots and Demo Video

![Map View](/mapView.png)

*Map view with exhibit search functionality.*

![Exhibit Details](/exhibitDetails.png)

*Detailed information about the Siamangs exhibit.*


![African Plains Carousel](/africanPlainsCarousel.png)

*Carousel view of the African Plains exhibit, showcasing animals like zebras and giraffes.*

![Plan View](/planView.png)

*User's plan view showing selected exhibits.*


![Directions View](/directionsView.png)

*The directions screen showing navigation to the Lion exhibit.*

### Demo Video
Watch our demo video to see ZooSeeker in action:  
https://drive.google.com/file/d/1lerUOz0uVX0yW8J89M2urawCvCeHSEaK/view?usp=sharing

## Key Features Demonstrated

- **Directions**: The app provides step-by-step directions to exhibits, including distance and time estimates.
- **Interactive Map**: Users can search for exhibits directly from the map interface, with dynamic markers indicating locations.
- **Exhibit Information**: Detailed descriptions, conservation status, and availability times for each exhibit.
- **Planning**: Users can create a customized plan by adding exhibits they wish to visit, ensuring they don't miss any highlights.

## Installation

To install ZooSeeker, follow these steps:

1. **Clone the repository**:  
   ```bash
   git clone https://github.com/MerlinZCC/ZooSeeker-Interactive-Zoo-Navigation-App.git
   ```
2. **Open the project in Android Studio**:  
   Select "Open Project" and choose the folder you just cloned.
3. **Set up the virtual device**:  
   Go to `Tools -> Device Manager`, configure a virtual device, and download the recommended system image.
4. **Compile and run the project**:  
   Wait for Gradle to finish building the project, then select the virtual device and click the "Run app" button in Android Studio.

## Usage

After installation, start the app and follow the on-screen instructions to select exhibits, create a plan, and navigate through the zoo.

## Documentation

- [Settings ADR](./Project%20Management/ADR/Database%20ADR)
- [Database ADR](./Project%20Management/ADR/Database%20ADR)
- [UI ADR](./Project%20Management/ADR/UI_ADR.md)
- [Map ADR](./Project%20Management/ADR/Map%20ADR.md)
- [Biweekly Workplans](./Project%20Management/CSE112%20Workplans)
- [Onboarding Guide](./Onboard.md)

## Technologies Used

- **Android Studio**: IDE for Android app development.
- **Java**: Programming language used for the app's backend.
- **Google Material Design**: UI components for a modern and intuitive user experience.
- **Local Storage**: Ensures data persistence for user plans and exhibit information.

## Testing

The app includes unit and instrumental tests to ensure its functionality and performance:

- **Unit Tests**: Validate the behavior of individual components.
- **Instrumental Tests**: Ensure the app interacts correctly with Android hardware.

Run tests using the following command in Android Studio:
```bash
./gradlew test
```

## Future Enhancements

- **Real-Time Updates**: Implement real-time updates for exhibit availability and navigation.
- **User Reviews**: Allow users to leave reviews and ratings for exhibits.
- **Event Integration**: Sync with the zoo's event calendar to highlight special attractions.

## Contributors

This project was developed by a team of 9 as part of an Advanced Software Engineering project.
![Team Image](/teamImage.png)
