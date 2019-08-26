import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'validate'
})
export class ValidatePipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    if(value=="" || value==undefined)
{
return "This is required field";
}
return "ALL Okay!";
}
  }

