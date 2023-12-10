import axios from 'axios';

const API_URL = process.env.REACT_APP_API_URL || 'http://localhost:8080';

interface Appointment {
    id?: number;
    startTime: string;
    endTime: string;
    description: string;
}

export const getAppointments = async (): Promise<Appointment[]> => {
    const response = await axios.get<Appointment[]>(`${API_URL}/appointments`);
    return response.data;
}

export const createAppointment = async (appointment: Appointment): Promise<Appointment> => {
    const response = await axios.post<Appointment>(`${API_URL}/appointments`, appointment);
    return response.data
}

