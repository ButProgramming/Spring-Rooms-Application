package com.mycompany.app.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    private RoomRepository repo;

    public List<Room> listAll() {
        return (List<Room>) repo.findAll();
    }

    public List<String> getCountries() {
        String[] countries = new String[]{"Belarus", "Andorra", "United Arab Emirates", "Afghanistan", "Antigua and Barbuda", "Anguilla", "Albania", "Armenia", "Angola",
                "Antarctica", "Argentina", "American Samoa", "Austria", "Australia", "Aruba", "Aland", "Azerbaijan", "Bosnia and Herzegovina", "Barbados",
                "Bangladesh", "Belgium", "Burkina Faso", "Bulgaria", "Bahrain", "Burundi", "Benin", "Saint Barthelemy", "Bermuda", "Brunei", "Bolivia",
                "Brazil", "Bahamas", "Bhutan", "Bouvet Island", "Botswana", "Belize", "Canada", "Cocos (Keeling) Islands", "DR Congo",
                "Central African Republic", "Congo Republic", "Switzerland", "Ivory Coast", "Cook Islands", "Chile", "Cameroon", "China", "Colombia",
                "Costa Rica", "Cuba", "Cabo Verde", "Curacao", "Christmas Island", "Cyprus", "Czechia", "Germany", "Djibouti", "Denmark", "Dominica",
                "Dominican Republic", "Algeria", "Ecuador", "Estonia", "Egypt", "Western Sahara", "Eritrea", "Spain", "Ethiopia", "Finland", "Fiji",
                "Falkland Islands", "Micronesia", "Faroe Islands", "France", "Gabon", "United Kingdom", "Grenada", "Georgia", "French Guiana", "Guernsey",
                "Ghana", "Gibraltar", "Greenland", "The Gambia", "Guinea", "Guadeloupe", "Equatorial Guinea", "Greece", "Guatemala", "Guam", "Guinea-Bissau",
                "Guyana", "Hong Kong", "Heard and McDonald Islands", "Honduras", "Croatia", "Haiti", "Hungary", "Indonesia", "Ireland", "Israel", "Isle of Man",
                "India", "Iraq", "Iran", "Iceland", "Italy", "Jersey", "Jamaica", "Jordan", "Japan", "Kenya", "Kyrgyzstan", "Cambodia", "Kiribati", "Comoros",
                "St Kitts and Nevis", "North Korea", "South Korea", "Kuwait", "Cayman Islands", "Kazakhstan", "Laos", "Lebanon", "Saint Lucia", "Liechtenstein",
                "Sri Lanka", "Liberia", "Lesotho", "Lithuania", "Luxembourg", "Latvia", "Libya", "Morocco", "Monaco", "Moldova", "Montenegro", "Saint Martin",
                "Madagascar", "Marshall Islands", "North Macedonia", "Mali", "Myanmar", "Mongolia", "Macao", "Northern Mariana Islands", "Martinique",
                "Mauritania", "Montserrat", "Malta", "Mauritius", "Maldives", "Malawi", "Mexico", "Malaysia", "Mozambique", "Namibia", "New Caledonia",
                "Niger", "Norfolk Island", "Nigeria", "Nicaragua", "Netherlands", "Norway", "Nepal", "Nauru", "Niue", "New Zealand", "Oman", "Panama", "Peru",
                "French Polynesia", "Papua New Guinea", "Philippines", "Pakistan", "Poland", "Pitcairn Islands", "Puerto Rico", "Palestine", "Portugal",
                "Palau", "Paraguay", "Qatar", "Reunion", "Romania", "Serbia", "Russia", "Rwanda", "Saudi Arabia", "Solomon Islands", "Seychelles", "Sudan",
                "Sweden", "Singapore", "Saint Helena", "Slovenia", "Svalbard and Jan Mayen", "Slovakia", "Sierra Leone", "San Marino", "Senegal", "Somalia",
                "Suriname", "South Sudan", "Sao Tome and Principe", "El Salvador", "Sint Maarten", "Syria", "Eswatini", "Turks and Caicos Islands", "Chad",
                "French Southern Territories", "Togo", "Thailand", "Tajikistan", "Tokelau", "Timor-Leste", "Turkmenistan", "Tunisia", "Tonga", "Turkey",
                "Trinidad and Tobago", "Tuvalu", "Taiwan", "Tanzania", "Ukraine", "Uganda", "U.S. Outlying Islands", "United States", "Uruguay", "Uzbekistan",
                "Vatican City", "St Vincent and Grenadines", "Venezuela", "British Virgin Islands", "U.S. Virgin Islands", "Vietnam", "Vanuatu",
                "Wallis and Futuna", "Samoa", "Kosovo", "Yemen", "Mayotte", "South Africa", "Zambia", "Zimbabwe"};
        List<String> countriesList = new ArrayList<>(Arrays.asList(countries));

        return countriesList;
    }

    public void save(Room room) {
        repo.save(room);
    }

    public Room get(Integer id) throws RoomNotFoundException {
        Optional<Room> result = repo.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        throw new RoomNotFoundException("Could not find any rooms with ID" + id);
    }

    public void update(Integer id, boolean enabled) {
        Optional<Room> room2 = repo.findById(id);
        Room room = room2.get();
        room.setEnabled(enabled);
        repo.save(room);
    }
}
