import React, { useState } from 'react';

const AppointmentForm = () => {
    const [name, setName] = useState<string>('');

    const handleSubmit = (event: React.FormEvent) => {
        event.preventDefault();
        // handle form submission
    }

    return (
        <form onSubmit={handleSubmit}>
            <label>
                Name:
            </label>
            <button type="submit">Book Appointment</button>
        </form>
    );
};

export default AppointmentForm;