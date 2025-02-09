let todoList = [
    { item: 'Buy Milk', dueDate: '2025-02-04' },
    { item: 'Go to College', dueDate: '2025-02-04' },
    { item: 'And study a Book', dueDate: '2025-05-04' },
    { item: 'Come to home', dueDate: '2025-02-06' }
];

displayItems();

function addTodo() {
    let inputElement = document.querySelector('#todo-input');
    let dateElement = document.querySelector('#todo-date');
    let todoItem = inputElement.value;
    let todoDate = dateElement.value;

    if (todoItem === '' || todoDate === '') {
        alert("Please enter both task and date.");
        return;
    }

    todoList.push({ item: todoItem, dueDate: todoDate });

    inputElement.value = '';
    dateElement.value = '';

    displayItems();
}

function displayItems() {
    let containerElement = document.querySelector('#todo-container');
    let newHtml = '';

    for (let i = 0; i < todoList.length; i++) {
        let { item, dueDate } = todoList[i];

        newHtml += `
            <span>${item}</span>
            <span>${dueDate}</span>
            <button class="button2" onclick="deleteTodo(${i});">Delete</button>
        `;
    }

    containerElement.innerHTML = newHtml;
}

function deleteTodo(index) {
    todoList.splice(index, 1);
    displayItems();
}
