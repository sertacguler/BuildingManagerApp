import axios from 'axios';

class DataService {
    retrieveCompanies() {
        console.log('execute started');
        return axios.get(`http://localhost:2525/companies`);
    };

    getCount() {
        console.log('execute started');
        return axios.get(`http://localhost:2525/count`);
    }

}

export default new DataService();