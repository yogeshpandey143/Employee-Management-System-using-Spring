import React, { Component } from 'react'

export default class HeaderComponent extends Component {
 
 constructor(props)
 {
    super(props)

    this.state ={

    }
 }
 
    render() {
    return (
      <div>

        <header >

            <nav className='navbar navbar-expand-md navbar-dark bg-success'>
             <div><a href="http://localhost:3000/"   className='navbar-brand'>Employee Mangement System</a></div>  
            </nav>
        </header>
      </div>
    )
  }
}
