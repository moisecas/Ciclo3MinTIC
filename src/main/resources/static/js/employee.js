
async function getEmployee() {
    const response = await fetch('/employees',{
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }

            }});
    const employees = await response.json();
    let list = document.getElementById('employee');
    employees.forEach(employee => {
        list.innerHTML += `<li>${employee.id}</li>` + `<li>${employee.email}</li>` + `<li>${employee.enterprise}</li>` + `<li>${employee.name}</li>` + `<li>${employee.password}</li>` + `<li>${employee.profile}</li>` + `<li>${employee.rol}</li>` + `<li

    }

        });
    return data;
}