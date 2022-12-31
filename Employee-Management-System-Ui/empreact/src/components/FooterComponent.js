import React, { Component } from 'react'

export default class FooterComponent extends Component {
  
    constructor(props)
    {
       super(props)
   
       this.state ={
           
       }
    }
    render() {
    return (
      <div>
   <footer className='footer'>
    <span  className='text-muted'>All Right Reserved 2022 @empreact</span>  
   </footer>

      </div>
    )
  }
}
