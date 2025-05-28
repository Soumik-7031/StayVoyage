# 🏨 StayVoyage Backend API 

A comprehensive RESTful API for managing hotels, rooms, bookings, guests, and more. Designed to support hotel administrators and end users alike, this system enables seamless booking, user profile management, and inventory tracking.

---

## 🚀 Features

- User authentication and profile management
- Hotel and room browsing
- Booking flow with guest and payment management
- Full admin panel for hotel and room management
- Inventory control per room
- Webhook support for payments

---

## 🧾 API Endpoints

### 📦 Inventory Management

- `GET /admin/inventory/rooms/{roomId}` – Get inventory of a room  
- `PATCH /admin/inventory/rooms/{roomId}` – Update inventory for a room  

---

### 🧾 Booking Workflow

- `POST /bookings/init` – Initialize a new booking  
- `POST /bookings/{bookingId}/addGuests` – Add guests to a booking  
- `POST /bookings/{bookingId}/payments` – Initiate payment  
- `POST /bookings/{bookingId}/cancel` – Cancel a booking  
- `GET /bookings/{bookingId}/status` – Check booking status  
- `GET /admin/hotels/{hotelId}/bookings` – Admin: Get all bookings for a hotel  
- `GET /admin/hotels/{hotelId}/reports` – Admin: Generate booking report  

---

### 👥 Guest Management

- `GET /users/guests` – Get user’s guest list  
- `POST /users/guests` – Add a guest  
- `PUT /users/guests/{guestId}` – Update guest info  
- `DELETE /users/guests/{guestId}` – Remove a guest  

---

### 🏨 Hotel Browsing

- `GET /hotels/search` – Search for hotels  
- `GET /hotels/{hotelId}/info` – Get detailed hotel information  

---

### 🛠️ Hotel Admin Management

- `POST /admin/hotels` – Create a hotel  
- `GET /admin/hotels` – Get all admin hotels  
- `GET /admin/hotels/{hotelId}` – Get hotel by ID  
- `PUT /admin/hotels/{hotelId}` – Update hotel details  
- `PATCH /admin/hotels/{hotelId}/activate` – Activate hotel  
- `DELETE /admin/hotels/{hotelId}` – Delete hotel  

---

### 🛏️ Room Admin Management

- `POST /admin/hotels/{hotelId}/rooms` – Create a room  
- `GET /admin/hotels/{hotelId}/rooms` – Get all rooms in a hotel  
- `GET /admin/hotels/{hotelId}/rooms/{roomId}` – Get room details  
- `PUT /admin/hotels/{hotelId}/rooms/{roomId}` – Update room  
- `DELETE /admin/hotels/{hotelId}/rooms/{roomId}` – Delete room  

---

### 🔐 Authentication

- `POST /auth/signup` – User signup  
- `POST /auth/login` – User login  
- `POST /auth/refresh` – Refresh access token  

---

### 👤 User Profile

- `GET /users/profile` – Get user profile  
- `PATCH /users/profile` – Update user profile  
- `GET /users/myBookings` – Get my bookings  

---

### 🔔 Webhooks

- `POST /webhook/payment` – Handle payment capture

  ---
  ## Schema
  ![svgviewer-output (1)](https://github.com/user-attachments/assets/d0c2c057-cbb4-435c-99b0-3eda24fbf0d4)

