# Database

Make sure to create a DB based on the schema file `dbschema.sql` included.

Username and password in application-dev.properties should probabaly be updated as well.

# Endpoints

## Agent

### Create

`localhost:8080/agent/create`

```json
{
    "firstName" : "Cameron",
    "surname" : "Guthrie",
    "phone" : "01234567890"
}
```

### Read (all)

`localhost:8080/agent/read/all`

### Read (by id)

`localhost:8080/agent/read/1`

### Update - PUT not PATCH

`localhost:8080/agent/update/1`

```json
{
    "firstName" : "Cam",
    "surname" : "Guthrie",
    "phone" : "01234567890"
}
```

### Delete

`http://localhost:8080/agent/delete/1`

# Seller

### Create

`localhost:8080/seller/create`

```json
{
    "firstName" : "Hugh",
    "surname" : "Mann",
    "address" : "this is a test address",
    "postcode" : "AB1 2CD",
    "phone" : "01234567890"
}
```

### Read (all)

`localhost:8080/seller/read/all`

### Read (by id)

`localhost:8080/seller/read/1`

### Update - PUT not PATCH

`localhost:8080/seller/update/1`

```json
{
    "firstName" : "Cameron",
    "surname" : "Guthrie",
    "address" : "this is a test address",
    "postcode" : "AB1 2CD",
    "phone" : "01234567890"
}
```

### Delete

`http://localhost:8080/seller/delete/1`

# Buyer

### Create

`localhost:8080/buyer/create`

```json
{
    "firstName" : "Aaron",
    "surname" : "Aaronson",
    "address" : "this is a test address",
    "postcode" : "AB1 2CD",
    "phone" : "01234567890"
}
```

### Read (all)

`localhost:8080/buyer/read/all`

### Read (by id)

`localhost:8080/buyer/read/1`

### Update - PUT not PATCH

`localhost:8080/buyer/update/1`

```json
{
    "firstName" : "Test",
    "surname" : "Person",
    "address" : "this is a test address",
    "postcode" : "AB1 2CD",
    "phone" : "01234567890"
}
```

### Delete

`http://localhost:8080/buyer/delete/1`

# Property

### Create

`localhost:8080/property/create`

```json
{
    "address" : "somewhere",
    "postcode" : "this is a postcode",
    "type" : "APARTMENT",
    "bedrooms" : 2,
    "bathrooms" : 1,
    "garden" : 0,
    "price" : 150000.40,
    "status" : "FORSALE",
    "seller" : {"id" : 1}
}
```

### Read (all)

`localhost:8080/property/read/all`

### Read (by id)

`localhost:8080/property/read/1`

### Update - PUT not PATCH

`localhost:8080/property/update/1`

```json
{
    "address" : "somewhere",
    "postcode" : "this is a postcode",
    "type" : "APARTMENT",
    "bedrooms" : 2,
    "bathrooms" : 1,
    "garden" : 0,
    "price" : 99.99,
    "status" : "SOLD",
    "seller" : {"id" : 1},
    "buyer" : {"id" : 1}
}
```

### Delete

`http://localhost:8080/property/delete/1`

# Booking

### Create

`localhost:8080/booking/create`

```json
{
    "agent" : {"id" : 1},
    "buyer" : {"id" : 1},
    "property" : {"id" : 1},
    "time" : "2024-12-03T14:30:00Z"
}
```

### Read (all)

`localhost:8080/booking/read/all`

### Read (by id)

`localhost:8080/booking/read/1`

### Update - PUT not PATCH

`localhost:8080/booking/update/1`

```json
{
    "agent" : {"id" : 1},
    "buyer" : {"id" : 1},
    "property" : {"id" : 1},
    "time" : "2024-12-03T12:00:00Z"
}
```

### Delete

`http://localhost:8080/booking/delete/1`
